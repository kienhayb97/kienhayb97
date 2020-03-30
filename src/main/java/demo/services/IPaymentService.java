package demo.services;

import demo.models.Payment;

public interface IPaymentService {
    Iterable<Payment> findAll();

    Payment findById(Long id);

    void save(Payment payment);

    void remove(Long id);
}
