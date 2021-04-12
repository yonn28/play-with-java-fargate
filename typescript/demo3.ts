class Avenger{
    nombre: String;
    arma: String;

    constructor(nombre:String,arma:String){
        this.nombre=nombre;
        this.arma = arma;
    }
}

let thor2 = new Avenger("Thor","Martillo");
let ironman = new Avenger("Ironman", "armadura");
let capi = new Avenger("Capitan America","Escudo");

let avengers:Avenger[] = [thor2, ironman , capi];

for (let avenger of avengers){
    console.log(`Avenger ${avenger.nombre} utiliza el arma ${avenger.arma}`)
    console.log("Hola mundo!!!!")
}