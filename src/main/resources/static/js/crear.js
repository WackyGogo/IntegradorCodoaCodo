function grabarPerdido() {

    let a = document.getElementById("inputAnimalPerdido").value;
    let z = document.getElementById("inputZonaPerdido").value;
    let n = document.getElementById("inputNombrePerdido").value;
    let c = document.getElementById("inputColorPerdido").value;

    let perdidos = {
        nombre: n,
        zona: z,
        raza: a,
        color: c,
    }

    let url = "http://localhost:8080/perdidos";
    var options = {
        method: 'POST',
        body: JSON.stringify(perdidos),
        headers: { 'Content-Type': 'application/json' },
        redirect: 'follow'
    }

    fetch(url, options).then(function () {
        console.log("creado");
    }).then(location.reload())
}

function grabarEncontrado() {

    document.get
    if (REQUIRED) {
        let a = document.getElementById("inputAnimalEncontrado").value;
        let z = document.getElementById("inputZonaEncontrado").value;
        let c = document.getElementById("inputColorEncontrado").value;
        let s = document.getElementById("inputSexoEncontrado").value;

        let encontrados = {
            zona: z,
            raza: a,
            color: c,
            sexo: s
        }

        let urlEnc = "http://localhost:8080/encontrados";
        var options = {
            method: 'POST',
            body: JSON.stringify(encontrados),
            headers: { 'Content-Type': 'application/json' },
            redirect: 'follow'
        }

        fetch(urlEnc, options).then(function () {
            console.log("creado");
        }).then(location.reload())
    }
}