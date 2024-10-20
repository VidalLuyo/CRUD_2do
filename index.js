    // Validación dinámica de cada campo mientras se escribe
    document.getElementById("tipoDocumento").addEventListener("change", validarNumeroDocumento);
    document.getElementById("numeroDocumento").addEventListener("input", validarNumeroDocumento);
    document.getElementById("nombre").addEventListener("input", validarLetras);
    document.getElementById("apellidos").addEventListener("input", validarLetras);
    document.getElementById("direccion").addEventListener("input", validarNoVacio);
    document.getElementById("alergico").addEventListener("input", validarNoVacio);
    document.getElementById("grado").addEventListener("input", validarGrado);
    document.getElementById("edad").addEventListener("input", validarNumero);
    document.getElementById("centroMedico").addEventListener("input", validarNoVacio);

    function validarNumeroDocumento() {
        let tipoDocumento = document.getElementById("tipoDocumento").value;
        let numeroDocumento = document.getElementById("numeroDocumento");
        const numeroPattern = /^\d+$/; // Solo números permitidos

        if (!numeroPattern.test(numeroDocumento.value)) {
            numeroDocumento.classList.add("is-invalid");
            numeroDocumento.classList.remove("is-valid");
            return;
        }

        if (tipoDocumento === "DNI" && numeroDocumento.value.length !== 8) {
            numeroDocumento.classList.add("is-invalid");
            numeroDocumento.classList.remove("is-valid");
        } else if (tipoDocumento === "CNE" && (numeroDocumento.value.length < 9 || numeroDocumento.value.length > 20)) {
            numeroDocumento.classList.add("is-invalid");
            numeroDocumento.classList.remove("is-valid");
        } else {
            numeroDocumento.classList.add("is-valid");
            numeroDocumento.classList.remove("is-invalid");
        }
    }

    function validarLetras(event) {
        const namePattern = /^[a-zA-ZÀ-ÿ\s]+$/; // Letras, tildes y espacios
        if (!namePattern.test(event.target.value)) {
            event.target.classList.add("is-invalid");
            event.target.classList.remove("is-valid");
        } else {
            event.target.classList.add("is-valid");
            event.target.classList.remove("is-invalid");
        }
    }

    function validarNoVacio(event) {
        if (event.target.value.trim() === "") {
            event.target.classList.add("is-invalid");
            event.target.classList.remove("is-valid");
        } else {
            event.target.classList.add("is-valid");
            event.target.classList.remove("is-invalid");
        }
    }

    function validarGrado(event) {
        let value = event.target.value;

        if (value >= 1 && value <= 50) {
            event.target.classList.add("is-valid");
            event.target.classList.remove("is-invalid");
        } else {
            event.target.classList.add("is-invalid");
            event.target.classList.remove("is-valid");
        }
    }

    function validarNumero(event) {
        let value = event.target.value;

        if (value >= 1 && value <= 100) {
            event.target.classList.add("is-valid");
            event.target.classList.remove("is-invalid");
        } else {
            event.target.classList.add("is-invalid");
            event.target.classList.remove("is-valid");
        }
    }

