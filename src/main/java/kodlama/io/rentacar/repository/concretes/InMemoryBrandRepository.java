package kodlama.io.rentacar.repository.concretes;

import kodlama.io.rentacar.entities.concretes.Brand;
import kodlama.io.rentacar.repository.abstracts.BrandRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<>();
        brands.add(new Brand(1, "Mercedes"));
        brands.add(new Brand(2, "BMW"));
        brands.add(new Brand(3, "Audi"));
        brands.add(new Brand(4, "Renault"));
        brands.add(new Brand(5, "Toyota"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
