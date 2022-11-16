const getMongo = require("./mongodb.js")


const productoGet = async () =>{
    const { collection, client } = await getConexiones()
    const productos = await collection.find({}).toArray()
    await getMongo.closeClientExport(client)
    return productos
}

const productoSet = async (producto) =>{
    const { collection, client } = await getConexiones()
    await collection.insertMany(producto)
    await getMongo.closeClientExport(client)
    return await productoGet()
}

const productosDelete = (id) =>{
    console.log(productos)
    productos = productos.filter((prod)=>{
        return prod.id != id
    }
    )
    console.log(productos)
    return productos
}

const productoGetid = async (id) =>{
    var productoEncontrado = null
    const { collection, client } = await getConexiones()
    await collection.findOne({"_id":id}).then(
        (respuesta) =>{
            productoEncontrado = respuesta
        }
    )
    await getMongo.closeClientExport(client)
    return productoEncontrado
}


const sillasReservadas = async (sillas, idproducto)=>{
    const { collection, client } = await getConexiones()
    /*for (let i = 0; i< productos.length; i++){
        if(idproducto === productos[i].id){
            for (let iproducto = 0; iproducto< productos[i].silla.length; iproducto++){
                for (let j = 0; j < sillas.length; j++){
                    if(productos[i].silla[iproducto].categoria === sillas[j].categoria){
                        productos[i].silla[iproducto].silla -= sillas[j].silla
                    }
                }
            }
            i=productos.length
        }
    }*/
    var producto = null

    await collection.findOne({"_id":idproducto}).then(
        (productoresp)=>{
            producto = productoresp
        }
    )
    /*
    for (let isilla = 0; isilla< producto.silla.length; isilla++){
        for (let j = 0; j < sillas.length; j++){
            if(producto.silla[isilla].categoria === sillas[j].categoria){
                if(sillas[j].cancelada){
                    producto.silla[isilla].silla += sillas[j].silla
                }else{
                    console.log(producto.silla[isilla].silla - sillas[j].silla)
                    if(producto.silla[isilla].silla - sillas[j].silla < 0){
                        console.log("Entro al error=?")
                        await getMongo.closeClientExport(client)
                        throw new Error("Sillas no disponibles")
                    }else{
                        producto.silla[isilla].silla -= sillas[j].silla
                    }
                }
            }
        }
    }

    await collection.updateOne({"_id":idproducto},{"$set":{"silla":producto.silla}})
    await getMongo.closeClientExport(client)
    return "Sillas reservada"
*/
}

module.exports.productoGetExport = productoGet;
module.exports.productoSetExport = productoSet;
module.exports.productosDeleteExport = productosDelete;
module.exports.productoGetidExport = productoGetid;
module.exports.sillasReservadasExport = sillasReservadas;

async function getConexiones() {
    const nameDb = "adminproductos"
    const client = await getMongo.getClientExport(nameDb)
    const collection = await getMongo.getCollectionExport(client, nameDb)
    return { collection, client }
}