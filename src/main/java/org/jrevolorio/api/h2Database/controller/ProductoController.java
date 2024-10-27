package org.jrevolorio.api.h2Database.controller;

import org.jrevolorio.api.h2Database.model.Producto;
import org.jrevolorio.api.h2Database.repository.ProductoRepository;
import org.jrevolorio.api.h2Database.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/h2Database/v1/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listar() {
        return productoService.listarProductos();
    }

    @PostMapping("/agregar")
    public Producto agregar(@RequestBody Producto producto) {
        return productoService.agregarProducto(producto);
    }

}
