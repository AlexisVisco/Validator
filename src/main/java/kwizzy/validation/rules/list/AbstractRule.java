package kwizzy.validation.rules.list;

import kwizzy.validation.RuleInfo;
import kwizzy.validation.impl.Rule;

public abstract class AbstractRule implements Rule {

    protected RuleInfo rule;

    public AbstractRule() { }

    @Override
    public RuleInfo getRuleInfo() {
        return rule;
    }

    @Override
    public void injectRuleInfo(RuleInfo r) {
        this.rule = r;
    }

    public String param(int i) {
        return rule.getParams().get(i);
    }

    public String field() {
        return getRuleInfo().getField();
    }

    public int params() {
        return getRuleInfo().getParamsCount();
    }
}
