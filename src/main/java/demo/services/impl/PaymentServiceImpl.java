package demo.services.impl;

import demo.models.Payment;
import demo.repositories.PaymentRepository;
import demo.services.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements IPaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Iterable<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment findById(Long id) {
        return paymentRepository.getOne(id);
    }

    @Override
    public void save(Payment payment) {
        paymentRepository.save(payment);
    }

    @Override
    public void remove(Long id) {
        paymentRepository.deleteById(id);
    }
}
