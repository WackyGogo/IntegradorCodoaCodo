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

    let url = "postgres://quwhxshzqyjtzy:fc6be089f887c0a86c5b3b1c8a1eab1017e1494eb6d74a35e8b3b94ab8d77761@ec2-23-23-181-251.compute-1.amazonaws.com:5432/perdidos";
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

        let urlEnc = "postgres://quwhxshzqyjtzy:fc6be089f887c0a86c5b3b1c8a1eab1017e1494eb6d74a35e8b3b94ab8d77761@ec2-23-23-181-251.compute-1.amazonaws.com:5432/encontrados";
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