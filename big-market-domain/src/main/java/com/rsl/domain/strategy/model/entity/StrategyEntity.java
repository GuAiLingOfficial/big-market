package com.rsl.domain.strategy.model.entity;

import com.rsl.types.common.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * @ description:策略实体
 * @ author: rsl
 * @ create: 2024-07-16 09:50
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyEntity {
    //抽奖策略ID
    private Long strategyId;
    //抽奖策略描述
    private String strategyDesc;
    //规则模型
    private String ruleModels;

    public String[] ruleModels() {
        if (StringUtils.isBlank(ruleModels)) return null;
        return ruleModels.split(Constants.SPLIT);
    }

    public String getRuleWeight() {
        String[] ruledModels = this.ruleModels();
        if (null == ruleModels) return null;
        for (String ruleModel : ruledModels) {
            if ("rule_weight".equals(ruleModel)) return ruleModel;
        }
        return null;
    }
}
