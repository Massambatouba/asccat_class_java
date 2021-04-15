package ascatt_bd.ascatt.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ascatt_bd.ascatt.entity.Membre;


@RepositoryRestResource
public interface MembreRepository extends MongoRepository<Membre,String> {

}
