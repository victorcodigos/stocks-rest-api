package modeloprojeto.stocks.rest.api.model;

import javax.persistence.*;

@Entity(name = "stocksup")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "name")
    private String name;

    @Column (name =  "nacionalidade")
    private String nacionalidade;

    @Column (name = "potencial")
    private boolean potencial;




}


