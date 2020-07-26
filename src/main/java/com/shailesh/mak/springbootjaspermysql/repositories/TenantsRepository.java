package com.shailesh.mak.springbootjaspermysql.repositories;

import com.shailesh.mak.springbootjaspermysql.models.Tenant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantsRepository extends CrudRepository<Tenant, Long> {
}
