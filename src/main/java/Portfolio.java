package com.yourcompany.yourproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long portfolioId;

    @OneToOne
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    private String lastUpdatedDate;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    // Default constructor
    public Portfolio() {}

    // Constructor with all fields
    public Portfolio(Client client, String creationDate, String lastUpdatedDate) {
        this.client = client;
        this.creationDate = creationDate;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    // Getters and setters
    public Long getPortfolioId() { return portfolioId; }
    public void setPortfolioId(Long portfolioId) { this.portfolioId = portfolioId; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public String getCreationDate() { return creationDate; }
    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }
    public String getLastUpdatedDate() { return lastUpdatedDate; }
    public void setLastUpdatedDate(String lastUpdatedDate) { this.lastUpdatedDate = lastUpdatedDate; }
    public List<Security> getSecurities() { return securities; }
    public void setSecurities(List<Security> securities) { this.securities = securities; }
}
