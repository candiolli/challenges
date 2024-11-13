package com.candiolli.patterns.strategy;

import java.math.BigDecimal;
import java.util.List;

public class CalculateInvestimentsProfitStrategyExample {

    public static void main(String[] args) {
        new CalculateInvestimentsProfitStrategyExample().execute();
    }

    public void execute() {
        Acoes acoes = new Acoes();
        Investimento investimento = new Investimento(acoes);
        BigDecimal calcula = investimento.calcula(List.of(new BigDecimal(10), new BigDecimal(5)));
        System.out.printf(calcula.toString());
    }

    interface InvestimentService {
        BigDecimal calcularRetorno(List<BigDecimal> investimentos);
    }

    class Acoes implements InvestimentService {
        @Override
        public BigDecimal calcularRetorno(List<BigDecimal> investimentos) {
            BigDecimal b = new BigDecimal(0);
            for (BigDecimal e : investimentos) {
                b.add(e);
            }
            return b.divide(new BigDecimal(investimentos.size()));
        }
    }

    class RendaFixa implements InvestimentService {
        @Override
        public BigDecimal calcularRetorno(List<BigDecimal> investimentos) {
            return null;
        }
    }

    class Investimento {

        private final InvestimentService service;

        public Investimento(InvestimentService service) {
            this.service = service;
        }

        public BigDecimal calcula(List<Object> investimentos) {
            return service.calcularRetorno(investimentos);
        }

    }
}
