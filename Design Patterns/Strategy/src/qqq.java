public class qqq {
    public Double calculationPrice(String type, Double originalPrice) {

        if (type.equals("apple")) {
            return originalPrice * 5;
        }

        if (type.equals("banana")) {
            return originalPrice * 6;
        }
        return originalPrice;
    }
}

interface PriceStrategy {

    Double countPrice(Double originalPrice);
}

class AppleStrategy implements PriceStrategy {
    @Override
    public Double countPrice(Double originalPrice) {
        return originalPrice * 5;
    }
}

class BananaStrategy implements PriceStrategy {
    @Override
    public Double countPrice(Double originalPrice) {
        return originalPrice * 6;
    }
}

class PriceContext {

    private final PriceStrategy fruitStrategy;

    public PriceContext(PriceStrategy fruitStrategy) { this.fruitStrategy = fruitStrategy; }

    public Double countPrice(Double originalPrice) { return fruitStrategy.countPrice(originalPrice);
    }

    public static void main(String[] args) {

        PriceStrategy appleStrategy = new AppleStrategy();
        PriceStrategy bananaStrategy = new BananaStrategy();

        PriceContext appleContext = new PriceContext(appleStrategy);
        PriceContext bananaContext = new PriceContext(bananaStrategy);

        System.out.println("苹果价格 = " + appleContext.countPrice(1D));
        System.out.println("香蕉价格 = " + bananaContext.countPrice(1D));
    }
}