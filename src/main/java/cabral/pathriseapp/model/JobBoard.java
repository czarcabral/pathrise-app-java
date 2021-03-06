package cabral.pathriseapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "job_board")
public class JobBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "job_generator")
    @SequenceGenerator(name = "job_generator", sequenceName = "job_id_seq")
    private Integer id;

    private String name;

    private String rating;

    @JsonProperty("root_domain")
    private String rootDomain;

    @JsonProperty("logo_file")
    private String logoFile;

    private String description;

    public JobBoard() { }

    public JobBoard(Integer id, String name, String rating, String rootDomain, String logoFile, String description) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.rootDomain = rootDomain;
        this.logoFile = logoFile;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRootDomain() {
        return rootDomain;
    }

    public void setRootDomain(String rootDomain) {
        this.rootDomain = rootDomain;
    }

    public String getLogoFile() {
        return logoFile;
    }

    public void setLogoFile(String logoFile) {
        this.logoFile = logoFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
