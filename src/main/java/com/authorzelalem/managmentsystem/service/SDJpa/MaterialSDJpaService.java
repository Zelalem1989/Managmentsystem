import java.util.*;
import repository.MaterialRepository;

@Service
@Profile("SDJpa")
public class MaterialSDJpaService implements MaterialService {

    private final MaterialRepository materialRepository;

    public MaterialSDJpaService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    @Override
    public Set<Material> findAll() {
        Set<Material> materials = new HashSet<>();
        materialRepository.findAll().forEach(materials::add);
        return materials;
    }

    @Override
    public Material findById(Long aLong) {
        return materialRepository.findById(aLong).orElse(null);
    }

    @Override
    public Material save(Material object) {
        return materialRepository.save(object);
    }

    @Override
    public void delete(Material object) {
        materialRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        materialRepository.deleteById(aLong);
    }
}