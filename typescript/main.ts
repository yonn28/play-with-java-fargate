interface Avenger{
    nombre: String;
    edad: number;
}

function desplegar(vengador:Avenger){
    console.log(vengador.edad);
}


var thor = {
    nombre: "Thor",
    edad : 2000,
}

desplegar(thor);