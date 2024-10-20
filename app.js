const express = require('express');
const bodyParser = require('body-parser');
const mysql = require('mysql2');
const path = require('path');
const fs = require('fs');
const app = express();

const port = 3000;

// Configuración de middleware para analizar el cuerpo de las solicitudes
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

app.use(express.static(path.join(__dirname)));

// Configuración de conexión a MySQL en RDS o tu base de datos local
let conexion = mysql.createConnection({
    host: "database-1.cpu2kase657b.us-east-1.rds.amazonaws.com",  // Ajusta los valores según tu RDS
    database: "boticadb",                                         // Nombre de la base de datos
    user: "admin",                                                // Usuario
    password: "admin123"                                           // Contraseña
});

// Conexión a la base de datos
conexion.connect((err) => {
    if (err) {
        console.error('Error de conexión a la base de datos: ' + err.stack);
        return;
    }
    console.log('Conectado a la base de datos.');
});

// Manejo de la solicitud POST del formulario para agregar un paciente
app.post('/submit-form', (req, res) => {
    const {
        tipo_documento, numero_documento, genero, nombre, apellidos, direccion,
        alergico, grado, edad, centro_medico
    } = req.body;

    // Consulta SQL para insertar los datos del paciente en la base de datos
    const query = 'INSERT INTO paciente (tipo_documento, numero_documento, genero, nombre, apellidos, direccion, alergico, grado, edad, centro_medico) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)';
    
    conexion.query(query, [
        tipo_documento, numero_documento, genero, nombre, apellidos, direccion,
        alergico, grado, edad, centro_medico
    ], (err, result) => {
        if (err) {
            console.error('Error al insertar datos: ' + err.stack);
            res.status(500).send('Ocurrió un error al procesar tu consulta.');
            return;
        }

        // Redirige a una página de confirmación o éxito (puedes ajustarlo como prefieras)
        const htmlPath = path.join(__dirname, 'index.html');
        fs.readFile(htmlPath, 'utf8', (err, data) => {
            if (err) {
                console.error('Error al leer el archivo HTML: ' + err);
                res.status(500).send('Ocurrió un error al procesar tu consulta.');
                return;
            }
            res.send(data);
        });
    });
});

// Servir el archivo HTML principal para el formulario
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'index.html'));
});

// Escuchar en el puerto especificado
app.listen(port, () => {
    console.log(`Servidor escuchando en http://localhost:${port}`);
});
