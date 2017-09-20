package io.pivotal.microsamples.hgp.api;

import io.pivotal.microsamples.hgp.model.Health;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthApiImpl implements HealthApi {

    @Override
    public ResponseEntity<Health> health() {
        Health health = new Health();
        health.setHealth("HGP is alive!");
        return new ResponseEntity<>(health, HttpStatus.OK);
    }
}
