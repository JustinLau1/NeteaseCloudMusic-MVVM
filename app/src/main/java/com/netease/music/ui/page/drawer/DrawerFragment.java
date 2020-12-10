package com.netease.music.ui.page.drawer;

import com.kunminx.architecture.ui.page.BaseFragment;
import com.kunminx.architecture.ui.page.DataBindingConfig;
import com.netease.music.R;
import com.netease.music.BR;
import com.netease.music.ui.state.DrawerViewModel;

public class DrawerFragment extends BaseFragment {

    private DrawerViewModel mDrawerViewModel;

    @Override
    protected void initViewModel() {
        mDrawerViewModel = getFragmentScopeViewModel(DrawerViewModel.class);
    }

    @Override
    protected DataBindingConfig getDataBindingConfig() {

        return new DataBindingConfig(R.layout.fragment_drawer, BR.vm, mDrawerViewModel)
                .addBindingParam(BR.click, new ClickProxy());
    }

    public class ClickProxy {

        //查看消息
        public void searchMessage() {
            nav().navigate(R.id.action_drawerFragment_to_messageTabActivity);
        }

        //查看音乐云盘
        public void searchCloud() {
            nav().navigate(R.id.action_drawerFragment_to_cloudActivity);
        }

        //登录界面
        public void login() {
            nav().navigate(R.id.action_drawerFragment_to_loginActivity);
        }
    }

}
