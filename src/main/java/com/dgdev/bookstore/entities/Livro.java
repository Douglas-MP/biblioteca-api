package com.dgdev.bookstore.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Livro {
    private Integer id;
    private String titulo;
    private String nome_autor;
    private String texto;
    private Categoria categoria;
}
