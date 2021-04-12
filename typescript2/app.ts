

function calucularTotal( constructor: Function){
    console.log(Function);
}

@calucularTotal
class factura{
    constructor(
            public valor:number,
            public  nombre:String
    ){

    }
}


let fact= new factura(100, "cuidados del perro");