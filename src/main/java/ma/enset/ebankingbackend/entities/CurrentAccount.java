package ma.enset.ebankingbackend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@DiscriminatorValue("CA")

@Data @NoArgsConstructor @AllArgsConstructor
public class CurentAccount extends BankAccount{
    private double overDraft;

}
