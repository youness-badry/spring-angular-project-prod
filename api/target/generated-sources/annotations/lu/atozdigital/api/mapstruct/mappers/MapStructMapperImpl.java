package lu.atozdigital.api.mapstruct.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import lu.atozdigital.api.entities.Article;
import lu.atozdigital.api.entities.Order;
import lu.atozdigital.api.mapstruct.dtos.ArticleDto;
import lu.atozdigital.api.mapstruct.dtos.OrderDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-19T17:47:01+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class MapStructMapperImpl implements MapStructMapper {

    @Override
    public ArticleDto articleToArticleDto(Article article) {
        if ( article == null ) {
            return null;
        }

        ArticleDto articleDto = new ArticleDto();

        articleDto.setId( article.getId() );
        articleDto.setName( article.getName() );
        articleDto.setPrice( article.getPrice() );
        articleDto.setPicture( article.getPicture() );

        return articleDto;
    }

    @Override
    public Article articleDtoToArticle(ArticleDto articleDto) {
        if ( articleDto == null ) {
            return null;
        }

        Article article = new Article();

        article.setId( articleDto.getId() );
        article.setName( articleDto.getName() );
        article.setPrice( articleDto.getPrice() );
        article.setPicture( articleDto.getPicture() );

        return article;
    }

    @Override
    public List<ArticleDto> articlesToArticleDtos(List<Article> articles) {
        if ( articles == null ) {
            return null;
        }

        List<ArticleDto> list = new ArrayList<ArticleDto>( articles.size() );
        for ( Article article : articles ) {
            list.add( articleToArticleDto( article ) );
        }

        return list;
    }

    @Override
    public OrderDto orderToOrderDto(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDto orderDto = new OrderDto();

        orderDto.setId( order.getId() );
        orderDto.setReference( order.getReference() );
        orderDto.setStatus( order.getStatus() );
        orderDto.setOrderDate( order.getOrderDate() );
        List<Article> list = order.getArticles();
        if ( list != null ) {
            orderDto.setArticles( new ArrayList<Article>( list ) );
        }

        return orderDto;
    }

    @Override
    public Order OrderDtoToOrder(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( orderDto.getId() );
        order.setReference( orderDto.getReference() );
        order.setStatus( orderDto.getStatus() );
        order.setOrderDate( orderDto.getOrderDate() );
        List<Article> list = orderDto.getArticles();
        if ( list != null ) {
            order.setArticles( new ArrayList<Article>( list ) );
        }

        return order;
    }

    @Override
    public List<OrderDto> ordersToOrderDtos(List<Order> orders) {
        if ( orders == null ) {
            return null;
        }

        List<OrderDto> list = new ArrayList<OrderDto>( orders.size() );
        for ( Order order : orders ) {
            list.add( orderToOrderDto( order ) );
        }

        return list;
    }
}
