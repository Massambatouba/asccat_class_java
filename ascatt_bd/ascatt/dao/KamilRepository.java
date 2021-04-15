package ascatt_bd.ascatt.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ascatt_bd.ascatt.entity.Kamil;

@RepositoryRestResource
public interface KamilRepository extends MongoRepository<Kamil,String> {

}
