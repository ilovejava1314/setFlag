import axios from 'axios'
import { Message } from 'iview'
axios.interceptors.request.use(
  config => {
    Message.loading('加载中', 0)
    return config
  },
  error => {
    Message.error('请求错误', 2)
    return Promise.reject(error)
  },
)
axios.interceptors.response.use(
  config => {
    if (config.data.code === 200) {
      Promise.all([Message.destroy(), Message.success('请求成功', 1)])
    }
    return config
  },
  error => {
    Message.error('响应错误', 2)
    return Promise.reject(error)
  },
)
export default axios
