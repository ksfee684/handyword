
package jp.ac.tsukuba.cs.coins_p.aid.handyword.communication.jsonschema2pojo.searchDicItem;

import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class TitleList {

    @ElementList(type = DicItemTitle.class)
    public List<DicItemTitle> DicItemTitle = new ArrayList<jp.ac.tsukuba.cs.coins_p.aid.handyword.communication.jsonschema2pojo.searchDicItem.DicItemTitle>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The DicItemTitle
     */
    public List<DicItemTitle> getDicItemTitle() {
        return DicItemTitle;
    }

    /**
     * 
     * @param DicItemTitle
     *     The DicItemTitle
     */
    public void setDicItemTitle(List<DicItemTitle> DicItemTitle) {
        this.DicItemTitle = DicItemTitle;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
