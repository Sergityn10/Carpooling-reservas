package incubadora.carpoolingreservas.Repositories;

import incubadora.carpoolingreservas.Entities.ReservaEntity;
import incubadora.carpoolingreservas.Model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservaRepository extends JpaRepository<ReservaEntity, Long> {
    // Buscar reservas por trayectoId
    List<ReservaEntity> findByTrayectoId(Long trayectoId);

    // Buscar reservas por userId
    List<ReservaEntity> findByUserId(Long userId);
    ReservaEntity findByUserIdAnAndTrayectoId(Long userId, Long trayectoId);
}
