var Avenger = /** @class */ (function () {
    function Avenger(nombre, arma) {
        this.nombre = nombre;
        this.arma = arma;
    }
    return Avenger;
}());
var thor2 = new Avenger("Thor", "Martillo");
var ironman = new Avenger("Ironman", "armadura");
var capi = new Avenger("Capitan America", "Escudo");
var avengers = [thor2, ironman, capi];
for (var _i = 0, avengers_1 = avengers; _i < avengers_1.length; _i++) {
    var avenger = avengers_1[_i];
    console.log("Avenger " + avenger.nombre + " utiliza el arma " + avenger.arma);
    console.log("Hola mundo!!!!");
}
