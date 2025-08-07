package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    RowMapper<Person> rowMapper = new RowMapper<Person>() {
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person p = new Person();
            p.setId(rs.getInt("id"));
            p.setAge(rs.getInt("age"));
            p.setFirstName(rs.getString("first_name"));
            p.setLastName(rs.getString("last_name"));
            return p;
        }
    };

    public List<Person> getAllPersons() {
        return jdbcTemplate.query("SELECT * FROM person", rowMapper);
    }

    public Person getPersonById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM person WHERE id = ?", rowMapper, id);
    }

    public void insertPerson(Person p) {
        jdbcTemplate.update("INSERT INTO person(age, first_name, last_name) VALUES (?, ?, ?)",
            p.getAge(), p.getFirstName(), p.getLastName());
    }

    public void updatePerson(Person p) {
        jdbcTemplate.update("UPDATE person SET age = ?, first_name = ?, last_name = ? WHERE id = ?",
            p.getAge(), p.getFirstName(), p.getLastName(), p.getId());
    }

    public void deletePerson(int id) {
        jdbcTemplate.update("DELETE FROM person WHERE id = ?", id);
    }
}
