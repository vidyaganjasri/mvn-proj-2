package com.acmecorp.payment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private static final Logger logger = LogManager.getLogger(PaymentController.class);

    @PostMapping("/process")
    public String processPayment(@RequestBody PaymentRequest request) {
        logger.info("Processing payment for: {}", request.getCustomerId());
        // payment logic here
        return "Payment processed successfully";
    }

    @GetMapping("/status/{id}")
    public String getStatus(@PathVariable String id) {
        logger.info("Fetching payment status for id: {}", id);
        return "COMPLETED";
    }
}
