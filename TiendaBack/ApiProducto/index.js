const express = require("express")
const cors = require("cors")
const body_parse = require("body-parser")
const path = require("path")
const productosService = require("./productoService.js")

const app = express()
const port = 8081


app.use(cors())
app.use(body_parse.json())

const pathName="/productos"


app.get(pathName,
    async (req, res)=>{
        console.log("Recibimos peticion")
        const id = req.query.id
        res.send(await productosService.productosgetExport(id))
    }
)


app.get(pathName+"/id",

       async (req, res)=>{
            console.log("Recibimos peticion")
            let id = req.query.id
            console.log(id)
            res.send(await productosService.productosgetidExport(id))
        }
    )


app.post(pathName,
    async (req, res)=>{
        console.log("Recibimos peticion")
        console.log(req.body)
        let productos = await productosService.productosSetExport(req.body)
        res.send({"mensaje":"Producto Guardado","productos":productos})
    }
)

app.delete(pathName,
    (req, res)=>{
        console.log("Recibimos peticion")
        let id = req.query.id
        console.log(id)
        let productos = productosService.productosDeleteExport(id)
        res.send({"mensaje":"Producto Guardado","productos":productos})
    }
)

app.put(pathName,
    (req, res)=>{
        console.log("Recibimos peticion")
        console.log(req.body)
        res.send("Finaliza")
    }
)

app.patch(pathName,
    (req, res)=>{
        console.log("Recibimos peticion")
        console.log(req.body)
        res.send("Finaliza")
    }
)
/*
app.patch(pathName+"/sillas",

    async (req, res)=>{
        try {
            console.log("reserva sillas")
            console.log(req.body)
            id = req.query.id
            res.send(await productosService.sillasReservadasExport(req.body,id))
        } catch (error) {
            res.status(500)
            res.send("Error al reservar la silla")
        }
        
    }   
)
*/

app.listen(port, 
    ()=>{
        console.log("Subio el api producto en el puerto "+port)
    }
)