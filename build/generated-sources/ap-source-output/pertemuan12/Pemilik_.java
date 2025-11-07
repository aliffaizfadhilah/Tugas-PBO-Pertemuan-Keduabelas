package pertemuan12;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pertemuan12.Petville;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-05T20:42:46", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pemilik.class)
public class Pemilik_ { 

    public static volatile SingularAttribute<Pemilik, String> noTelepon;
    public static volatile CollectionAttribute<Pemilik, Petville> petvilleCollection;
    public static volatile SingularAttribute<Pemilik, String> idPemilik;
    public static volatile SingularAttribute<Pemilik, String> namaPemilik;
    public static volatile SingularAttribute<Pemilik, String> alamat;

}