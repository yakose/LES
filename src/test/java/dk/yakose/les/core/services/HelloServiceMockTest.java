/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.les.core.services;

import dk.yakose.les.core.services.abstracts.HelloService;
import dk.yakose.les.core.services.concretes.HelloServiceImpl;
import dk.yakose.les.repository.abstracts.HelloRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


/**
 *
 * @author yakos
 */
//@ExtendWith(MockitoExtension.class) , need this? still able to run.
@SpringBootTest
public class HelloServiceMockTest {

    @Mock
    private HelloRepository helloRepository;
    //@Spy
    @InjectMocks // auto inject helloRepository
    private final HelloService helloService;

    public HelloServiceMockTest() {
        this.helloService = new HelloServiceImpl();
    }

    @BeforeEach
    void setMockOutput() {
        //when(helloService.get()).thenReturn("Hello Mockito");
        when(helloRepository.get()).thenReturn("Hello Mockito From Responsitory");
    }

    @DisplayName("Test Mock helloService + helloRepository")
    @Test
    void testGet() {
        assertEquals("Hello Mockito From Responsitory", helloService.get());
    }

}
