function grabarPerdido(){
    let a=document.getElementById("inputAnimalPerdido").value;
    let z=document.getElementById("inputZonaPerdido").value;
    let n=document.getElementById("inputNombrePerdido").value;
    let c=document.getElementById("inputColorPerdido").value;

    let perdidos={
        nombre:n,
        zona:z,
        raza:a,
        color:c,
    }

    let url= "http://localhost:8080/perdidos";
    var options = {
        method: 'POST',
        body: JSON.stringify(perdidos),
        headers: {'Content-Type': 'application/json'},
        redirect: 'follow'
    }

    fetch(url,options).then(function(){
        console.log("creado");
    }).then(location.reload())   
}