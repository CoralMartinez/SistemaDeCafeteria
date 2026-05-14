const prompt = require("prompt-sync")();

let opcion = -1;

while(opcion != 0){

    console.log("\n====================");
    console.log("CAFETERIA");
    console.log("====================");
    console.log("1. Cafe Americano");
    console.log("2. Capuccino");
    console.log("3. Frappe");
    console.log("4. Dona");
    console.log("5. Pastel");
    console.log("6. Sandwich");
    console.log("7. Sincronizadas");
    console.log("0. Salir");

    opcion = prompt("Selecciona opcion: ");

    if(opcion == 1){
        console.log("Cafe Americano agregado");
    }

    else if(opcion == 2){
        console.log("Capuccino agregado");
    }

    else if(opcion == 3){
        console.log("Frappe agregado");
    }

    else if(opcion == 4){
        console.log("Dona agregada");
    }

    else if(opcion == 5){
        console.log("Pastel agregado");
    }

    else if(opcion == 6){
        console.log("Sandwich agregado");
    }

    else if(opcion == 7){
        console.log("Sincronizadas agregadas");
    }

    else if(opcion == 0){
        console.log("Gracias por su compra");
    }

    else{
        console.log("Opcion invalida");
    }
}