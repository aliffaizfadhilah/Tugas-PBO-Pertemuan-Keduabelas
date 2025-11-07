package pertemuan12;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pertemuan12.Pemilik;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-05T20:42:46", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Petville.class)
public class Petville_ { 

    public static volatile SingularAttribute<Petville, String> jenisHewan;
    public static volatile SingularAttribute<Petville, Integer> harga;
    public static volatile SingularAttribute<Petville, String> idHewan;
    public static volatile SingularAttribute<Petville, Pemilik> idPemilik;
    public static volatile SingularAttribute<Petville, String> namaHewan;

}