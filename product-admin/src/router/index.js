import Vue from 'vue'
import Router from 'vue-router'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/admin',
      component: resolve => require(['../container/AdminLayOut.vue'], resolve),
      redirect: '/admin/home',
      children: [
        {
          path: 'home',
          component: resolve => require(['../components/Home.vue'], resolve),
          meta: {
            isKeep: false,
          },
        },
        {
          path: 'product',
          component: resolve => require(['../components/Product.vue'], resolve),
          meta: {
            isKeep: false,
          },
        },
      ],
    },
  ],
})
