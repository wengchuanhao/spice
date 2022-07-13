// 引入Vue
import Vue from 'vue'
// 引入App
import App from './App.vue'
// 引入二次封装的axios
import axiosInstance from '@/tools/axiosParamsSet'
// 引入vue-router
import vueRouter from 'vue-router'
// 引入路由器
import router from '@/router'

// 使用vue-router插件；使用后new Vue实例就可以传入一个新的配置项router,值是自己配置的路由器
Vue.use(vueRouter)

// 关闭生产提示
Vue.config.productionTip = false

// 把axios绑定到Vue原型上，以便所有组件都能通过this获取axios
Vue.prototype.$axios = axiosInstance

// 创建vm实例
new Vue({
  render: h => h(App),
  router:router
}).$mount('#app')
