package SlayTheSpider.Model.Game.FileStorage.ElementParser.CardEffectBuilders;

import SlayTheSpider.Model.Game.CardEffect.CardEffect;
import SlayTheSpider.Model.Game.CardEffect.SelfShieldEffect;
import org.w3c.dom.Element;

public class XMLSelfShieldEffectBuilder implements XMLCardEffectBuilder {
    @Override
    public CardEffect create(Element element) {
        String amount = element.getAttribute("amount");
        return new SelfShieldEffect(Integer.parseInt(amount));
    }
}
