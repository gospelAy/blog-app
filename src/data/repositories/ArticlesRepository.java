package data.repositories;

import data.models.Article;

import java.util.List;

public interface ArticlesRepository {
    Article save(Article article);

    Article findById(int id);

    long count();

    List<Article> findAll();

    void delete(int id);

    void delete(Article articles);

    void deleteAll();
}
