<script lang="ts">
import {
    Chart as ChartJS,
    Title,
    Tooltip,
    Legend,
    PointElement,
    LineElement,
    CategoryScale,
    LinearScale
} from 'chart.js'
import { Line } from 'vue-chartjs'

ChartJS.register(CategoryScale, LinearScale, PointElement, LineElement, Title, Tooltip, Legend)

ChartJS.defaults.color = "#FFFFFF"

export default {
    name: 'LineChart',
    components: {
        Line
    },
    data() {
        return {
            data: {
                labels: ['January', 'February', 'March'],
                datasets: [
                    {
                        label: 'World', 
                        data: [40, 20, 12],
                        backgroundColor: ['#41B883', '#E46651', '#00D8FF', '#DD1B16']
                    }
                ]
            },
            options: {
                responsive: true,
                aspectRatio: 1 | 1
            }
        }
    }
}
</script>

<template>
    <Line :data="data" :options="options" />
</template>