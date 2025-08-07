package com.example.MavenProject;

public abstract class AccountRepository {

    abstract Account findById(String id);
    abstract void update(Account account);
}
