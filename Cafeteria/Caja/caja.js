// ==============================
//  SISTEMA DE CAJA CAFETERÍA
// ==============================

const pedidos = [
    {
        nombre: "Café Cappuccino",
        precio: 35
    },

    {
        nombre: "Pastel de chocolate",
        precio: 50
    },

    {
        nombre: "Sandwich de jamón",
        precio: 55
    }
];


// MOSTRAR PRODUCTOS COMPRADOS

console.log("══════════════════════════════");
console.log("TICKET DE COMPRA");
console.log("══════════════════════════════");

let total = 0;

for(let i = 0; i < pedidos.length; i++){

    console.log(
        (i + 1) + ". " +
        pedidos[i].nombre +
        " - $" +
        pedidos[i].precio
    );

    total += pedidos[i].precio;
}


// MOSTRAR TOTAL

console.log("══════════════════════════════");
console.log(" TOTAL A PAGAR: $" + total);
console.log("══════════════════════════════");


// PAGO DEL CLIENTE

let pagoCliente = 200;

console.log(" Pago recibido: $" + pagoCliente);


// CALCULAR CAMBIO

let cambio = pagoCliente - total;

console.log(" Cambio: $" + cambio);

console.log("\n Gracias por su compra");
console.log(" Vuelva pronto ");