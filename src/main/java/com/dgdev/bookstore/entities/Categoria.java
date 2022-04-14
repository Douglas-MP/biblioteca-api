package com.dgdev.bookstore.entities;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Categoria {
    private Integer id;
    private String nome;
    private String descricao;
    private List<Livro> livros = new ArrayList<>();
}
