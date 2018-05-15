package com.jhchu.f1info.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.jhchu.f1info.entity.f1team;

import java.util.List;

@Repository
public interface f1teamDao extends PagingAndSortingRepository<f1team, Long>, JpaSpecificationExecutor<f1team> {

    @Query(value = "select * from f1_team a where a.team_name = :team_name order by a.team_id limit 5", nativeQuery = true)
    public List<f1team> queryf1teamByTeamName(
            @Param("team_name") String team_name);
}



