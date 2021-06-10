package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela LISTAENDERECO
* @generated
*/
@Entity
@Table(name = "\"LISTAENDERECO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ListaEndereco")
public class ListaEndereco implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "cidade", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cidade;

    /**
    * @generated
    */
    @Column(name = "endereco", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String endereco;

    /**
    * @generated
    */
    @Column(name = "bairro", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String bairro;

    /**
    * @generated
    */
    @Column(name = "estado", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String estado;

    /**
    * @generated
    */
    @Column(name = "nome", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;

    /**
    * @generated
    */
    @Column(name = "telefone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String telefone;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private User user;

    /**
    * Construtor
    * @generated
    */
    public ListaEndereco(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public ListaEndereco setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém cidade
    * return cidade
    * @generated
    */
    
    public java.lang.String getCidade(){
        return this.cidade;
    }

    /**
    * Define cidade
    * @param cidade cidade
    * @generated
    */
    public ListaEndereco setCidade(java.lang.String cidade){
        this.cidade = cidade;
        return this;
    }
    /**
    * Obtém endereco
    * return endereco
    * @generated
    */
    
    public java.lang.String getEndereco(){
        return this.endereco;
    }

    /**
    * Define endereco
    * @param endereco endereco
    * @generated
    */
    public ListaEndereco setEndereco(java.lang.String endereco){
        this.endereco = endereco;
        return this;
    }
    /**
    * Obtém bairro
    * return bairro
    * @generated
    */
    
    public java.lang.String getBairro(){
        return this.bairro;
    }

    /**
    * Define bairro
    * @param bairro bairro
    * @generated
    */
    public ListaEndereco setBairro(java.lang.String bairro){
        this.bairro = bairro;
        return this;
    }
    /**
    * Obtém estado
    * return estado
    * @generated
    */
    
    public java.lang.String getEstado(){
        return this.estado;
    }

    /**
    * Define estado
    * @param estado estado
    * @generated
    */
    public ListaEndereco setEstado(java.lang.String estado){
        this.estado = estado;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public ListaEndereco setNome(java.lang.String nome){
        this.nome = nome;
        return this;
    }
    /**
    * Obtém telefone
    * return telefone
    * @generated
    */
    
    public java.lang.String getTelefone(){
        return this.telefone;
    }

    /**
    * Define telefone
    * @param telefone telefone
    * @generated
    */
    public ListaEndereco setTelefone(java.lang.String telefone){
        this.telefone = telefone;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    
    public User getUser(){
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public ListaEndereco setUser(User user){
        this.user = user;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
ListaEndereco object = (ListaEndereco)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}