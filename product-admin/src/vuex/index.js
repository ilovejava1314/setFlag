import Vue from 'vue'
import Vuex from 'vuex'
import state from './states'
import muatation from './mutation'
import actions from './actions'
import getters from './getters'
Vue.use(Vuex)
export default new Vuex.Store({
  state,
  getters,
  actions,
  muatation
})
