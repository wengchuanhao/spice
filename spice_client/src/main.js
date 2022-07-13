import Vue from 'vue'
import App from './App.vue'

import axiosInstance from '@/assets/tools/axiosParamsSet'

Vue.prototype.$axios = axiosInstance
Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')
