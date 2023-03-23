package kodlama.io.rentacar.api.controllers;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private final BrandService service;

    public BrandsController(BrandService service) {
        this.service = service;
    }

    @GetMapping
    public List<Brand> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Brand getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public Brand add(@RequestBody Brand brand) {
        return service.add(brand);
    }

    @PutMapping("/{id}")
    public Brand update(@PathVariable int id, @RequestBody Brand brand) {
        return service.update(id, brand);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
