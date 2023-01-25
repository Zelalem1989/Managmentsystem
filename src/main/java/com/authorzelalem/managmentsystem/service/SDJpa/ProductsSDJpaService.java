import java.util.*;
import repository.ProductsRepository;

@Service
@Profile("SDJpa")
public class ProductsSDJpaService implements ProductsService {

    private final ProductsRepository productsRepository;

    public ProductsSDJpaService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public Set<Products> findAll() {
        Set<Products> products = new HashSet<>();
        ProductsRepository.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Products findById(Long aLong) {
        return productsRepository.findById(aLong).orElse(null);
    }

    @Override
    public Products save(Products object) {
        return productsRepository.save(object);
    }

    @Override
    public void delete(Products object) {
        productsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        productsRepository.deleteById(aLong);
    }
}