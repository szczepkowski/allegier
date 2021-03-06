package pl.allegier.controller.frontend.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.allegier.TestConfiguration;
import pl.allegier.controller.frontend.dto.OrderDto;
import pl.allegier.model.Order;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Pawel Szczepkowski | Satlan on 18.04.17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
public class OrderMapperTest {

    @Autowired
    private Mapper<OrderDto,Order> orderMapper;

    @Test
    public void fromDto()
    {
        OrderDto dto = new OrderDto();
        Order dao = orderMapper.fromDto(dto);

        assertThat( dto.getCreated(), equalTo( dao.getCreated()) );
        assertThat( dto.getUpdated(), equalTo( dao.getUpdated()) );
    }

    @Test
    public void fromDao()
    {
        OrderDto dto = new OrderDto();
        Order dao = orderMapper.fromDto(dto);

        assertThat( dto.getCreated(), equalTo( dao.getCreated()) );
        assertThat( dto.getUpdated(), equalTo( dao.getUpdated()) );
    }

}